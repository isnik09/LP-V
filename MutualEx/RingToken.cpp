#include <iostream>
#include <thread>
#include <mutex>
#include <condition_variable>

const int NUM_THREADS = 5; // Number of threads participating in the token ring

// Shared data between threads
std::mutex mtx;
std::condition_variable cv;
bool token = false;
int currentThread = 0;

// Function executed by each thread
void tokenRing(int id)
{
    while (true)
    {
        std::unique_lock<std::mutex> lock(mtx);

        // Wait until it's the thread's turn
        cv.wait(lock, [&id]
                { return id == currentThread; });

        // Critical section
        std::cout << "Thread " << id << " is in the critical section." << std::endl;

        // Sleep for some time to simulate work inside the critical section
        std::this_thread::sleep_for(std::chrono::milliseconds(1000));

        std::cout << "Thread " << id << " is exiting the critical section." << std::endl;

        // Pass the token to the next thread
        currentThread = (currentThread + 1) % NUM_THREADS;
        token = true;

        // Notify the next thread
        cv.notify_all();
    }
}

int main()
{
    std::thread threads[NUM_THREADS];

    // Create threads
    for (int i = 0; i < NUM_THREADS; ++i)
    {
        threads[i] = std::thread(tokenRing, i);
    }

    // Start the token ring
    token = true;
    cv.notify_all();

    // Wait for threads to finish
    for (int i = 0; i < NUM_THREADS; ++i)
    {
        threads[i].join();
    }

    return 0;
}


// This implementation ensures that only one thread enters 
// the critical section at a time, achieving 
// mutual exclusion through the Token Ring algorithm.