package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  String resourceType();

  Optional<Narrative> text();

  Optional<Boolean> deceasedBoolean();

  Optional<List<Patient_Communication>> communication();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> generalPractitioner();

  Optional<List<Patient_Contact>> contact();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<List<HumanName>> name();

  Optional<String> deceasedDateTime();

  Optional<List<ResourceList>> contained();

  Optional<List<ContactPoint>> telecom();

  Optional<PatientGender> gender();

  Optional<CodeableConcept> maritalStatus();

  Optional<Double> multipleBirthInteger();

  Optional<Reference> managingOrganization();

  Optional<Boolean> multipleBirthBoolean();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<Date> birthDate();

  Optional<Boolean> active();

  Optional<List<Attachment>> photo();

  Optional<List<Address>> address();

  Optional<List<Patient_Link>> link();

  static ImmutablePatient.ResourceTypeBuildStage builder() {
    return ImmutablePatient.builder();
  }
}
