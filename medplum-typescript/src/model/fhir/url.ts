export type url = string & {
    __url: void,
};

export const url = {
    of: (value: string): url => value as url
};
