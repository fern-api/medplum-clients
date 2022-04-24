package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableConsent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Consent {
  String resourceType();

  Optional<List<Reference>> organization();

  Optional<uri> implicitRules();

  List<CodeableConcept> category();

  Optional<id> id();

  Optional<ConsentStatus> status();

  Optional<List<Consent_Verification>> verification();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Attachment> sourceAttachment();

  Optional<List<Extension>> modifierExtension();

  Optional<dateTime> dateTime();

  Optional<List<Identifier>> identifier();

  CodeableConcept scope();

  Optional<List<Consent_Policy>> policy();

  Optional<List<Extension>> extension();

  Optional<Consent_Provision> provision();

  Optional<Reference> sourceReference();

  Optional<CodeableConcept> policyRule();

  Optional<Reference> patient();

  Optional<code> language();

  Optional<Meta> meta();

  Optional<List<Reference>> performer();

  static ImmutableConsent.ResourceTypeBuildStage builder() {
    return ImmutableConsent.builder();
  }
}
