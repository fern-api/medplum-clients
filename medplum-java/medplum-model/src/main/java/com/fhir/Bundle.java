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
    as = ImmutableBundle.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bundle {
  Optional<code> language();

  Optional<List<Bundle_Entry>> entry();

  Optional<uri> implicitRules();

  Optional<id> id();

  Optional<Meta> meta();

  Optional<Signature> signature();

  Optional<Identifier> identifier();

  Optional<unsignedInt> total();

  String resourceType();

  Optional<List<Bundle_Link>> link();

  Optional<instant> timestamp();

  Optional<BundleType> type();

  static ImmutableBundle.ResourceTypeBuildStage builder() {
    return ImmutableBundle.builder();
  }
}
