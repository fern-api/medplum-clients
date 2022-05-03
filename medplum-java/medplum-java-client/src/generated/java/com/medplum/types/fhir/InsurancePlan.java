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
    as = ImmutableInsurancePlan.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan {
  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> coverageArea();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> type();

  Optional<Period> period();

  Optional<Narrative> text();

  Optional<List<InsurancePlan_Plan>> plan();

  Optional<List<String>> alias();

  Optional<List<InsurancePlan_Coverage>> coverage();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<Reference> administeredBy();

  Optional<String> name();

  Optional<List<Reference>> network();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<InsuranceplanStatus> status();

  Optional<List<Reference>> endpoint();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> ownedBy();

  Optional<List<InsurancePlan_Contact>> contact();

  static ImmutableInsurancePlan.ResourceTypeBuildStage builder() {
    return ImmutableInsurancePlan.builder();
  }
}
