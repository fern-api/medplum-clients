export type dateTime = string & {
    __dateTime: void,
};

export const dateTime = {
    of: (value: string): dateTime => value as dateTime
};
