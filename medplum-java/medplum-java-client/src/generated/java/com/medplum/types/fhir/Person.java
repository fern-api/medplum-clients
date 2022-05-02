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
    as = ImmutablePerson.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Person {
  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<Address>> address();

  Optional<Meta> meta();

  Optional<Attachment> photo();

  Optional<List<ContactPoint>> telecom();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<Reference> managingOrganization();

  Optional<List<Extension>> extension();

  Optional<PersonGender> gender();

  Optional<Boolean> active();

  Optional<List<Person_Link>> link();

  Optional<Narrative> text();

  Optional<Date> birthDate();

  Optional<List<HumanName>> name();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> id();

  static ImmutablePerson.ResourceTypeBuildStage builder() {
    return ImmutablePerson.builder();
  }
}
