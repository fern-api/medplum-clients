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
    as = ImmutableQuantity.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Quantity {
  Optional<String> id();

  Optional<String> unit();

  Optional<QuantityComparator> comparator();

  Optional<Code> code();

  Optional<List<Extension>> extension();

  Optional<Uri> system();

  Optional<Decimal> value();

  static ImmutableQuantity.Builder builder() {
    return ImmutableQuantity.builder();
  }
}
