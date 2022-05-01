export type code = string & {
    __code: void;
};

export const code = {
    of: (value: string): code => value as code,
};
