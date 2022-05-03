export declare type uuid = string & {
    __uuid: void;
};
export declare const uuid: {
    of: (value: string) => uuid;
};
