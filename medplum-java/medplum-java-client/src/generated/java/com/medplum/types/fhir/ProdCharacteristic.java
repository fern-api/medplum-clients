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
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<String>> imprint();

  Optional<List<Extension>> extension();

  Optional<Quantity> depth();

  Optional<Quantity> height();

  Optional<List<String>> color();

  Optional<CodeableConcept> scoring();

  Optional<Quantity> width();

  Optional<String> shape();

  Optional<Quantity> externalDiameter();

  Optional<Quantity> weight();

  Optional<Quantity> nominalVolume();

  Optional<List<Attachment>> image();

  static ImmutableProdCharacteristic.Builder builder() {
    return ImmutableProdCharacteristic.builder();
  }
}
