import { code } from "./code";
import { ContactPoint } from "./ContactPoint";
import { Extension } from "./Extension";
import { id } from "./id";
import { instant } from "./instant";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { ResourceList } from "./ResourceList";
import { SubscriptionStatus } from "./SubscriptionStatus";
import { Subscription_Channel } from "./Subscription_Channel";
import { uri } from "./uri";
export interface Subscription {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    status: SubscriptionStatus | null | undefined;
    contact: ContactPoint[] | null | undefined;
    end: instant | null | undefined;
    reason: string | null | undefined;
    criteria: string | null | undefined;
    error: string | null | undefined;
    channel: Subscription_Channel;
}
