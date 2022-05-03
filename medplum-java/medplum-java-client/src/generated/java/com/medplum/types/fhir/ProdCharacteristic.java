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
  Optional<String> shape();

  Optional<List<String>> imprint();

  Optional<List<Extension>> extension();

  Optional<Quantity> nominalVolume();

  Optional<String> id();

  Optional<Quantity> height();

  Optional<Quantity> externalDiameter();

  Optional<CodeableConcept> scoring();

  Optional<Quantity> depth();

  Optional<List<String>> color();

  Optional<Quantity> width();

  Optional<Quantity> weight();

  Optional<List<Attachment>> image();

  Optional<List<Extension>> modifierExtension();

  static ImmutableProdCharacteristic.Builder builder() {
    return ImmutableProdCharacteristic.builder();
  }
}
