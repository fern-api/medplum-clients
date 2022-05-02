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
    as = ImmutablePractitioner.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Practitioner {
  Optional<Uri> implicitRules();

  Optional<List<HumanName>> name();

  Optional<Date> birthDate();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<Boolean> active();

  Optional<PractitionerGender> gender();

  Optional<List<Attachment>> photo();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<List<Address>> address();

  Optional<List<CodeableConcept>> communication();

  Optional<List<Practitioner_Qualification>> qualification();

  Optional<Id> id();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<List<ContactPoint>> telecom();

  static ImmutablePractitioner.ResourceTypeBuildStage builder() {
    return ImmutablePractitioner.builder();
  }
}
