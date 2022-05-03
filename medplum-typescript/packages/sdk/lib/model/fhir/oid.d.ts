export declare type oid = string & {
    __oid: void;
};
export declare const oid: {
    of: (value: string) => oid;
};
