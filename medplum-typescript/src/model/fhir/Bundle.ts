import { BundleType } from "./BundleType";
import { Bundle_Entry } from "./Bundle_Entry";
import { Bundle_Link } from "./Bundle_Link";
import { code } from "./code";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { instant } from "./instant";
import { Meta } from "./Meta";
import { Signature } from "./Signature";
import { unsignedInt } from "./unsignedInt";
import { uri } from "./uri";

export interface Bundle {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    identifier: Identifier | null | undefined;
    type: BundleType | null | undefined;
    timestamp: instant | null | undefined;
    total: unsignedInt | null | undefined;
    link: Bundle_Link[] | null | undefined;
    entry: Bundle_Entry[] | null | undefined;
    signature: Signature | null | undefined;
}
