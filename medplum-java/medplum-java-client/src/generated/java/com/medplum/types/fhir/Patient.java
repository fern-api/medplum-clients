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
  Optional<Narrative> text();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<Patient_Contact>> contact();

  Optional<Boolean> deceasedBoolean();

  Optional<Meta> meta();

  Optional<Boolean> active();

  Optional<Reference> managingOrganization();

  Optional<List<Identifier>> identifier();

  Optional<Date> birthDate();

  Optional<List<Patient_Communication>> communication();

  Optional<List<HumanName>> name();

  Optional<List<Reference>> generalPractitioner();

  Optional<Id> id();

  Optional<PatientGender> gender();

  Optional<List<ResourceList>> contained();

  Optional<List<Address>> address();

  Optional<List<ContactPoint>> telecom();

  Optional<List<Extension>> extension();

  Optional<Double> multipleBirthInteger();

  Optional<List<Attachment>> photo();

  Optional<CodeableConcept> maritalStatus();

  Optional<List<Patient_Link>> link();

  Optional<Boolean> multipleBirthBoolean();

  Optional<String> deceasedDateTime();

  static ImmutablePatient.ResourceTypeBuildStage builder() {
    return ImmutablePatient.builder();
  }
}
