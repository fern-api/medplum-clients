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

  Optional<Boolean> inactive();

  Optional<List<Extension>> extension();

  Optional<Period> period();

  Optional<String> id();

  Reference entity();

  static ImmutableGroup_Member.EntityBuildStage builder() {
    return ImmutableGroup_Member.builder();
  }
}
