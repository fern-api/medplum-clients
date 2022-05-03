package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableRelatedPerson.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RelatedPerson {
  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Reference patient();

  Optional<List<RelatedPerson_Communication>> communication();

  Optional<Meta> meta();

  Optional<Period> period();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<RelatedpersonGender> gender();

  Optional<List<HumanName>> name();

  Optional<Code> language();

  Optional<List<ContactPoint>> telecom();

  Optional<Boolean> active();

  Optional<Uri> implicitRules();

  Optional<Date> birthDate();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> relationship();

  Optional<List<Address>> address();

  Optional<List<Attachment>> photo();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  static ImmutableRelatedPerson.PatientBuildStage builder() {
    return ImmutableRelatedPerson.builder();
  }
}
