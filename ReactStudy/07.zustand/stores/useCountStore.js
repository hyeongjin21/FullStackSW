// create : store를 생성해주는 함수
import { create } from "zustand";

const useCountStore = create((set,get) => ({
    count: 0,
    increase: () => set((state) => ({
        count: state.count + 1
    })),
    increaseBy: (number) => set((state) => ({
        count: state.count + number
    })),
    // let {count} = get() -> state에 명시된 값들이 들어있다
    decrease: (number) => set((state) => ({
        count: state.count > 0 ? state.count - number : state.count 
    }))
}))

export default useCountStore;