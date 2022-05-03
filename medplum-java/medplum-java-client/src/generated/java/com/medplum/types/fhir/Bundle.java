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
    as = ImmutableBundle.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bundle {
  Optional<Code> language();

  Optional<BundleType> type();

  Optional<Uri> implicitRules();

  Optional<Identifier> identifier();

  Optional<Meta> meta();

  Optional<Instant> timestamp();

  String resourceType();

  Optional<Signature> signature();

  Optional<Id> id();

  Optional<List<Bundle_Entry>> entry();

  Optional<List<Bundle_Link>> link();

  Optional<UnsignedInt> total();

  static ImmutableBundle.ResourceTypeBuildStage builder() {
    return ImmutableBundle.builder();
  }
}
