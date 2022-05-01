export type canonical = string & {
    __canonical: void;
};

export const canonical = {
    of: (value: string): canonical => value as canonical,
};
