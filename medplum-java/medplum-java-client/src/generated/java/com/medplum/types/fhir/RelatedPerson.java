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
  Optional<Code> language();

  Optional<Date> birthDate();

  Reference patient();

  Optional<List<ContactPoint>> telecom();

  Optional<Narrative> text();

  Optional<List<Attachment>> photo();

  Optional<List<Identifier>> identifier();

  Optional<RelatedpersonGender> gender();

  Optional<List<CodeableConcept>> relationship();

  Optional<Boolean> active();

  Optional<List<RelatedPerson_Communication>> communication();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<Address>> address();

  Optional<Uri> implicitRules();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<HumanName>> name();

  Optional<Meta> meta();

  Optional<Period> period();

  Optional<Id> id();

  static ImmutableRelatedPerson.PatientBuildStage builder() {
    return ImmutableRelatedPerson.builder();
  }
}
