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
    as = ImmutableMoney.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Money {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<code> currency();

  Optional<decimal> value();

  static ImmutableMoney.Builder builder() {
    return ImmutableMoney.builder();
  }
}
