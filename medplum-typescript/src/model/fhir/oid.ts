export type oid = string & {
    __oid: void,
};

export const oid = {
    of: (value: string): oid => value as oid
};
