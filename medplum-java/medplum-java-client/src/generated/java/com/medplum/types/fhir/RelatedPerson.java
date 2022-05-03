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
  Optional<Date> birthDate();

  Optional<Boolean> active();

  Optional<RelatedpersonGender> gender();

  Optional<List<HumanName>> name();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<Address>> address();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> relationship();

  Optional<Period> period();

  Optional<List<RelatedPerson_Communication>> communication();

  Optional<List<ContactPoint>> telecom();

  String resourceType();

  Optional<List<Attachment>> photo();

  Optional<Narrative> text();

  Reference patient();

  Optional<Meta> meta();

  Optional<Code> language();

  static ImmutableRelatedPerson.ResourceTypeBuildStage builder() {
    return ImmutableRelatedPerson.builder();
  }
}
