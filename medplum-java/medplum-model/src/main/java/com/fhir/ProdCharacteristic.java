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
    as = ImmutableProdCharacteristic.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ProdCharacteristic {
  Optional<List<Attachment>> image();

  Optional<CodeableConcept> scoring();

  Optional<List<Extension>> extension();

  Optional<Quantity> width();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> externalDiameter();

  Optional<Quantity> depth();

  Optional<String> shape();

  Optional<List<String>> color();

  Optional<Quantity> weight();

  Optional<Quantity> nominalVolume();

  Optional<List<String>> imprint();

  Optional<String> id();

  Optional<Quantity> height();

  static ImmutableProdCharacteristic.Builder builder() {
    return ImmutableProdCharacteristic.builder();
  }
}
