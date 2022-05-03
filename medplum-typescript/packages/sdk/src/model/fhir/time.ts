export type time = string & {
    __time: void;
};

export const time = {
    of: (value: string): time => value as time,
};
