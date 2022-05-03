package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    as = ImmutableCoverage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Coverage {
  Optional<CodeableConcept> relationship();

  Optional<String> dependent();

  Optional<String> subscriberId();

  Optional<Id> id();

  Reference beneficiary();

  Optional<Code> status();

  Optional<PositiveInt> order();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> contract();

  Optional<Narrative> text();

  @JsonProperty("class")
  Optional<List<Coverage_Class>> _class();

  List<Reference> payor();

  Optional<String> network();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> subscriber();

  Optional<List<Identifier>> identifier();

  Optional<List<Coverage_CostToBeneficiary>> costToBeneficiary();

  Optional<Boolean> subrogation();

  String resourceType();

  Optional<CodeableConcept> type();

  Optional<Period> period();

  Optional<Uri> implicitRules();

  Optional<Reference> policyHolder();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  static ImmutableCoverage.BeneficiaryBuildStage builder() {
    return ImmutableCoverage.builder();
  }
}
