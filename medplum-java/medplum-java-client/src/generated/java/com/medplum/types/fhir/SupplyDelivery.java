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
    as = ImmutableSupplyDelivery.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SupplyDelivery {
  Optional<Id> id();

  Optional<SupplyDelivery_SuppliedItem> suppliedItem();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> partOf();

  Optional<Uri> implicitRules();

  Optional<Reference> patient();

  Optional<Period> occurrencePeriod();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Timing> occurrenceTiming();

  Optional<String> occurrenceDateTime();

  Optional<List<Reference>> receiver();

  Optional<SupplydeliveryStatus> status();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> basedOn();

  Optional<Reference> supplier();

  Optional<Reference> destination();

  Optional<CodeableConcept> type();

  static ImmutableSupplyDelivery.ResourceTypeBuildStage builder() {
    return ImmutableSupplyDelivery.builder();
  }
}
