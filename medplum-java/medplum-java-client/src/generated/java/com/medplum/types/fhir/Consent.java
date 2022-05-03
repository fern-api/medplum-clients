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
  List<CodeableConcept> category();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> sourceReference();

  Optional<Id> id();

  Optional<ConsentStatus> status();

  Optional<List<Identifier>> identifier();

  Optional<List<Consent_Verification>> verification();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> performer();

  Optional<Narrative> text();

  Optional<CodeableConcept> policyRule();

  Optional<Uri> implicitRules();

  Optional<Consent_Provision> provision();

  Optional<Attachment> sourceAttachment();

  CodeableConcept scope();

  String resourceType();

  Optional<List<Reference>> organization();

  Optional<List<ResourceList>> contained();

  Optional<List<Consent_Policy>> policy();

  Optional<Reference> patient();

  Optional<DateTime> dateTime();

  Optional<Code> language();

  static ImmutableConsent.ScopeBuildStage builder() {
    return ImmutableConsent.builder();
  }
}
