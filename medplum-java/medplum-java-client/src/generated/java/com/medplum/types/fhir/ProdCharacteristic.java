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
  Optional<Quantity> externalDiameter();

  Optional<List<String>> color();

  Optional<Quantity> depth();

  Optional<List<Attachment>> image();

  Optional<Quantity> height();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> scoring();

  Optional<String> shape();

  Optional<List<Extension>> extension();

  Optional<Quantity> weight();

  Optional<List<String>> imprint();

  Optional<Quantity> nominalVolume();

  Optional<String> id();

  Optional<Quantity> width();

  static ImmutableProdCharacteristic.Builder builder() {
    return ImmutableProdCharacteristic.builder();
  }
}
