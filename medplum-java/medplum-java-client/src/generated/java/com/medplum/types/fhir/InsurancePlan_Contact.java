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
    as = ImmutableInsurancePlan_Contact.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_Contact {
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> purpose();

  Optional<List<Extension>> extension();

  Optional<HumanName> name();

  Optional<String> id();

  Optional<Address> address();

  Optional<List<ContactPoint>> telecom();

  static ImmutableInsurancePlan_Contact.Builder builder() {
    return ImmutableInsurancePlan_Contact.builder();
  }
}
