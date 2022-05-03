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
  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> performer();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<List<Consent_Policy>> policy();

  Optional<List<Extension>> extension();

  Optional<Consent_Provision> provision();

  String resourceType();

  CodeableConcept scope();

  Optional<List<Reference>> organization();

  Optional<Reference> sourceReference();

  Optional<Attachment> sourceAttachment();

  Optional<Uri> implicitRules();

  List<CodeableConcept> category();

  Optional<ConsentStatus> status();

  Optional<Reference> patient();

  Optional<CodeableConcept> policyRule();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<Consent_Verification>> verification();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> dateTime();

  static ImmutableConsent.ResourceTypeBuildStage builder() {
    return ImmutableConsent.builder();
  }
}
