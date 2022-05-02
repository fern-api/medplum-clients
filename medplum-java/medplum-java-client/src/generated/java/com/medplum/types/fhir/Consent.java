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
  Optional<List<Extension>> extension();

  List<CodeableConcept> category();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> performer();

  Optional<List<Reference>> organization();

  Optional<DateTime> dateTime();

  Optional<Consent_Provision> provision();

  Optional<Narrative> text();

  Optional<Reference> sourceReference();

  String resourceType();

  Optional<ConsentStatus> status();

  Optional<Attachment> sourceAttachment();

  Optional<List<Consent_Verification>> verification();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<Reference> patient();

  Optional<CodeableConcept> policyRule();

  CodeableConcept scope();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<List<Consent_Policy>> policy();

  static ImmutableConsent.ResourceTypeBuildStage builder() {
    return ImmutableConsent.builder();
  }
}
