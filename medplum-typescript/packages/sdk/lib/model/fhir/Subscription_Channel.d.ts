import { code } from "./code";
import { Extension } from "./Extension";
import { Subscription_channelType } from "./Subscription_channelType";
import { url } from "./url";
export interface Subscription_Channel {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Subscription_channelType | null | undefined;
    endpoint: url | null | undefined;
    payload: code | null | undefined;
    header: string[] | null | undefined;
}
