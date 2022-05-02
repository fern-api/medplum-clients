package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<List<Consent_Verification>> verification();

  Optional<ConsentStatus> status();

  Optional<Id> id();

  Optional<List<Consent_Policy>> policy();

  Optional<Meta> meta();

  String resourceType();

  Optional<Narrative> text();

  Optional<Reference> patient();

  Optional<CodeableConcept> policyRule();

  Optional<Consent_Provision> provision();

  List<CodeableConcept> category();

  Optional<List<Reference>> performer();

  Optional<List<ResourceList>> contained();

  Optional<Attachment> sourceAttachment();

  CodeableConcept scope();

  Optional<List<Identifier>> identifier();

  Optional<Reference> sourceReference();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<DateTime> dateTime();

  Optional<List<Reference>> organization();

  static ImmutableConsent.ResourceTypeBuildStage builder() {
    return ImmutableConsent.builder();
  }
}
