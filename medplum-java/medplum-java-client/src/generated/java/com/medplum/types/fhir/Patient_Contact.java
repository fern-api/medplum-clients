package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutablePatient_Contact.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Patient_Contact {
  Optional<Address> address();

  Optional<Period> period();

  Optional<List<CodeableConcept>> relationship();

  Optional<Patient_contactGender> gender();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<ContactPoint>> telecom();

  Optional<Reference> organization();

  Optional<HumanName> name();

  static ImmutablePatient_Contact.Builder builder() {
    return ImmutablePatient_Contact.builder();
  }
}
