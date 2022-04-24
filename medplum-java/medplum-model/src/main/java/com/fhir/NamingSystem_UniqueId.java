package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableNamingSystem_UniqueId.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NamingSystem_UniqueId {
  Optional<List<Extension>> extension();

  Optional<Boolean> preferred();

  Optional<Namingsystem_uniqueidType> type();

  Optional<String> id();

  Optional<String> comment();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> period();

  Optional<String> value();

  static ImmutableNamingSystem_UniqueId.Builder builder() {
    return ImmutableNamingSystem_UniqueId.builder();
  }
}
