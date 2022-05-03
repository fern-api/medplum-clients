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
  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<Date> birthDate();

  Optional<Meta> meta();

  Optional<List<Address>> address();

  Optional<Boolean> active();

  Optional<List<CodeableConcept>> communication();

  Optional<Id> id();

  Optional<PractitionerGender> gender();

  Optional<Code> language();

  Optional<List<Practitioner_Qualification>> qualification();

  Optional<List<HumanName>> name();

  Optional<List<Attachment>> photo();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ContactPoint>> telecom();

  static ImmutablePractitioner.ResourceTypeBuildStage builder() {
    return ImmutablePractitioner.builder();
  }
}
