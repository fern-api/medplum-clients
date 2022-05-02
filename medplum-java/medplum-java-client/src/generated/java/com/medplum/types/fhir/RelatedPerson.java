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
  Optional<Id> id();

  Optional<RelatedpersonGender> gender();

  Reference patient();

  Optional<List<HumanName>> name();

  String resourceType();

  Optional<Meta> meta();

  Optional<Boolean> active();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> relationship();

  Optional<List<Extension>> extension();

  Optional<List<ContactPoint>> telecom();

  Optional<Date> birthDate();

  Optional<List<Address>> address();

  Optional<List<Attachment>> photo();

  Optional<Narrative> text();

  Optional<List<RelatedPerson_Communication>> communication();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<Period> period();

  static ImmutableRelatedPerson.PatientBuildStage builder() {
    return ImmutableRelatedPerson.builder();
  }
}
