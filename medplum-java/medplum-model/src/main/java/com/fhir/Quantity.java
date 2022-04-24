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
    as = ImmutableQuantity.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Quantity {
  Optional<String> unit();

  Optional<code> code();

  Optional<List<Extension>> extension();

  Optional<uri> system();

  Optional<String> id();

  Optional<QuantityComparator> comparator();

  Optional<decimal> value();

  static ImmutableQuantity.Builder builder() {
    return ImmutableQuantity.builder();
  }
}
