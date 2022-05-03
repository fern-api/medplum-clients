export type id = string & {
    __id: void;
};

export const id = {
    of: (value: string): id => value as id,
};
