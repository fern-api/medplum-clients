export type uuid = string & {
    __uuid: void;
};

export const uuid = {
    of: (value: string): uuid => value as uuid,
};
