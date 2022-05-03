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
    as = ImmutableMoney.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Money {
  Optional<Decimal> value();

  Optional<String> id();

  Optional<Code> currency();

  Optional<List<Extension>> extension();

  static ImmutableMoney.Builder builder() {
    return ImmutableMoney.builder();
  }
}
