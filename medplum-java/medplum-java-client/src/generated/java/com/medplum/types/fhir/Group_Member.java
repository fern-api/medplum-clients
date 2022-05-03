package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableGroup_Member.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Group_Member {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Boolean> inactive();

  Reference entity();

  Optional<Period> period();

  Optional<String> id();

  static ImmutableGroup_Member.EntityBuildStage builder() {
    return ImmutableGroup_Member.builder();
  }
}
