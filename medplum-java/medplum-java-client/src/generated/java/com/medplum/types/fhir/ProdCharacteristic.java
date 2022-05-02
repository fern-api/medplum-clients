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
    as = ImmutableProdCharacteristic.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ProdCharacteristic {
  Optional<String> id();

  Optional<Quantity> height();

  Optional<Quantity> width();

  Optional<Quantity> externalDiameter();

  Optional<String> shape();

  Optional<Quantity> depth();

  Optional<CodeableConcept> scoring();

  Optional<List<String>> imprint();

  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> color();

  Optional<List<Extension>> extension();

  Optional<Quantity> weight();

  Optional<List<Attachment>> image();

  Optional<Quantity> nominalVolume();

  static ImmutableProdCharacteristic.Builder builder() {
    return ImmutableProdCharacteristic.builder();
  }
}
