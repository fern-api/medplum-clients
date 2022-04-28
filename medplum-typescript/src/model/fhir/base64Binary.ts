export type base64Binary = string & {
    __base64Binary: void,
};

export const base64Binary = {
    of: (value: string): base64Binary => value as base64Binary
};
