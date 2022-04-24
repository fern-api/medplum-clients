package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Reference beneficiary();

  Optional<Period> period();

  Optional<Reference> subscriber();

  Optional<Reference> policyHolder();

  Optional<String> subscriberId();

  Optional<Meta> meta();

  Optional<List<Coverage_CostToBeneficiary>> costToBeneficiary();

  Optional<CodeableConcept> relationship();

  Optional<String> network();

  Optional<List<Extension>> extension();

  Optional<id> id();

  String resourceType();

  Optional<code> status();

  Optional<Boolean> subrogation();

  @JsonProperty("class")
  Optional<List<Coverage_Class>> _class();

  Optional<uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  List<Reference> payor();

  Optional<CodeableConcept> type();

  Optional<Narrative> text();

  Optional<List<Reference>> contract();

  Optional<positiveInt> order();

  Optional<code> language();

  Optional<String> dependent();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  static ImmutableCoverage.BeneficiaryBuildStage builder() {
    return ImmutableCoverage.builder();
  }
}
