package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<String> id();

  Optional<Period> period();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> organization();

  Optional<Address> address();

  Optional<Patient_contactGender> gender();

  Optional<HumanName> name();

  Optional<List<CodeableConcept>> relationship();

  Optional<List<ContactPoint>> telecom();

  Optional<List<Extension>> extension();

  static ImmutablePatient_Contact.Builder builder() {
    return ImmutablePatient_Contact.builder();
  }
}
