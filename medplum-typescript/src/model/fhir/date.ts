export type date = string & {
    __date: void,
};

export const date = {
    of: (value: string): date => value as date
};
