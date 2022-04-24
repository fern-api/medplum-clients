package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutablePatient.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Patient {
  Optional<Boolean> multipleBirthBoolean();

  Optional<List<Patient_Link>> link();

  Optional<List<Identifier>> identifier();

  Optional<List<Patient_Contact>> contact();

  Optional<id> id();

  Optional<uri> implicitRules();

  String resourceType();

  Optional<code> language();

  Optional<List<Extension>> extension();

  Optional<Boolean> deceasedBoolean();

  Optional<List<ResourceList>> contained();

  Optional<Reference> managingOrganization();

  Optional<List<Address>> address();

  Optional<Meta> meta();

  Optional<String> deceasedDateTime();

  Optional<List<ContactPoint>> telecom();

  Optional<Double> multipleBirthInteger();

  Optional<Boolean> active();

  Optional<PatientGender> gender();

  Optional<List<Reference>> generalPractitioner();

  Optional<date> birthDate();

  Optional<Narrative> text();

  Optional<List<Patient_Communication>> communication();

  Optional<CodeableConcept> maritalStatus();

  Optional<List<HumanName>> name();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Attachment>> photo();

  static ImmutablePatient.ResourceTypeBuildStage builder() {
    return ImmutablePatient.builder();
  }
}
