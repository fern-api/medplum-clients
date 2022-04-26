package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Coding}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoding.builder()}.
 */
@Generated(from = "Coding", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoding implements Coding {
  private final @Nullable Boolean userSelected;
  private final @Nullable String id;
  private final @Nullable String version;
  private final @Nullable List<Extension> extension;
  private final @Nullable Uri system;
  private final @Nullable String display;
  private final @Nullable Code code;

  private ImmutableCoding(
      @Nullable Boolean userSelected,
      @Nullable String id,
      @Nullable String version,
      @Nullable List<Extension> extension,
      @Nullable Uri system,
      @Nullable String display,
      @Nullable Code code) {
    this.userSelected = userSelected;
    this.id = id;
    this.version = version;
    this.extension = extension;
    this.system = system;
    this.display = display;
    this.code = code;
  }

  /**
   * @return The value of the {@code userSelected} attribute
   */
  @JsonProperty("userSelected")
  @Override
  public Optional<Boolean> userSelected() {
    return Optional.ofNullable(userSelected);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<String> version() {
    return Optional.ofNullable(version);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @JsonProperty("system")
  @Override
  public Optional<Uri> system() {
    return Optional.ofNullable(system);
  }

  /**
   * @return The value of the {@code display} attribute
   */
  @JsonProperty("display")
  @Override
  public Optional<String> display() {
    return Optional.ofNullable(display);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Code> code() {
    return Optional.ofNullable(code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coding#userSelected() userSelected} attribute.
   * @param value The value for userSelected
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withUserSelected(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.userSelected, newValue)) return this;
    return new ImmutableCoding(newValue, this.id, this.version, this.extension, this.system, this.display, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coding#userSelected() userSelected} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for userSelected
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withUserSelected(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.userSelected, value)) return this;
    return new ImmutableCoding(value, this.id, this.version, this.extension, this.system, this.display, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coding#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCoding(this.userSelected, newValue, this.version, this.extension, this.system, this.display, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coding#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCoding(this.userSelected, value, this.version, this.extension, this.system, this.display, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coding#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableCoding(this.userSelected, this.id, newValue, this.extension, this.system, this.display, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coding#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableCoding(this.userSelected, this.id, value, this.extension, this.system, this.display, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coding#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoding(this.userSelected, this.id, this.version, newValue, this.system, this.display, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coding#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoding withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoding(this.userSelected, this.id, this.version, value, this.system, this.display, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coding#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withSystem(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableCoding(this.userSelected, this.id, this.version, this.extension, newValue, this.display, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coding#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoding withSystem(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableCoding(this.userSelected, this.id, this.version, this.extension, value, this.display, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coding#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withDisplay(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "display");
    if (Objects.equals(this.display, newValue)) return this;
    return new ImmutableCoding(this.userSelected, this.id, this.version, this.extension, this.system, newValue, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coding#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withDisplay(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.display, value)) return this;
    return new ImmutableCoding(this.userSelected, this.id, this.version, this.extension, this.system, value, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coding#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCoding(this.userSelected, this.id, this.version, this.extension, this.system, this.display, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coding#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoding withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCoding(this.userSelected, this.id, this.version, this.extension, this.system, this.display, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoding} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoding
        && equalTo((ImmutableCoding) another);
  }

  private boolean equalTo(ImmutableCoding another) {
    return Objects.equals(userSelected, another.userSelected)
        && Objects.equals(id, another.id)
        && Objects.equals(version, another.version)
        && Objects.equals(extension, another.extension)
        && Objects.equals(system, another.system)
        && Objects.equals(display, another.display)
        && Objects.equals(code, another.code);
  }

  /**
   * Computes a hash code from attributes: {@code userSelected}, {@code id}, {@code version}, {@code extension}, {@code system}, {@code display}, {@code code}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(userSelected);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(system);
    h += (h << 5) + Objects.hashCode(display);
    h += (h << 5) + Objects.hashCode(code);
    return h;
  }

  /**
   * Prints the immutable value {@code Coding} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Coding{");
    if (userSelected != null) {
      builder.append("userSelected=").append(userSelected);
    }
    if (id != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (version != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (extension != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (system != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("system=").append(system);
    }
    if (display != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("display=").append(display);
    }
    if (code != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("code=").append(code);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Coding", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Coding {
    @Nullable Optional<Boolean> userSelected = Optional.empty();
    boolean userSelectedIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Uri> system = Optional.empty();
    boolean systemIsSet;
    @Nullable Optional<String> display = Optional.empty();
    boolean displayIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @JsonProperty("userSelected")
    public void setUserSelected(Optional<Boolean> userSelected) {
      this.userSelected = userSelected;
      this.userSelectedIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("system")
    public void setSystem(Optional<Uri> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @JsonProperty("display")
    public void setDisplay(Optional<String> display) {
      this.display = display;
      this.displayIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @Override
    public Optional<Boolean> userSelected() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> system() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> display() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCoding fromJson(Json json) {
    ImmutableCoding.Builder builder = ImmutableCoding.builder();
    if (json.userSelectedIsSet) {
      builder.userSelected(json.userSelected);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    return (ImmutableCoding) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Coding} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Coding instance
   */
  public static Coding copyOf(Coding instance) {
    if (instance instanceof ImmutableCoding) {
      return (ImmutableCoding) instance;
    }
    return ImmutableCoding.builder()
        .userSelected(instance.userSelected())
        .id(instance.id())
        .version(instance.version())
        .extension(instance.extension())
        .system(instance.system())
        .display(instance.display())
        .code(instance.code())
        .build();
  }

  /**
   * Creates a builder for {@link Coding Coding}.
   * <pre>
   * ImmutableCoding.builder()
   *    .userSelected(Boolean) // optional {@link Coding#userSelected() userSelected}
   *    .id(String) // optional {@link Coding#id() id}
   *    .version(String) // optional {@link Coding#version() version}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Coding#extension() extension}
   *    .system(com.medplum.types.fhir.Uri) // optional {@link Coding#system() system}
   *    .display(String) // optional {@link Coding#display() display}
   *    .code(com.medplum.types.fhir.Code) // optional {@link Coding#code() code}
   *    .build();
   * </pre>
   * @return A new Coding builder
   */
  public static ImmutableCoding.Builder builder() {
    return new ImmutableCoding.Builder();
  }

  /**
   * Builds instances of type {@link Coding Coding}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Coding", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_USER_SELECTED = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_VERSION = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_SYSTEM = 0x10L;
    private static final long OPT_BIT_DISPLAY = 0x20L;
    private static final long OPT_BIT_CODE = 0x40L;
    private long optBits;

    private @Nullable Boolean userSelected;
    private @Nullable String id;
    private @Nullable String version;
    private @Nullable List<Extension> extension;
    private @Nullable Uri system;
    private @Nullable String display;
    private @Nullable Code code;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Coding#userSelected() userSelected} to userSelected.
     * @param userSelected The value for userSelected
     * @return {@code this} builder for chained invocation
     */
    public final Builder userSelected(boolean userSelected) {
      checkNotIsSet(userSelectedIsSet(), "userSelected");
      this.userSelected = userSelected;
      optBits |= OPT_BIT_USER_SELECTED;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#userSelected() userSelected} to userSelected.
     * @param userSelected The value for userSelected
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("userSelected")
    public final Builder userSelected(Optional<Boolean> userSelected) {
      checkNotIsSet(userSelectedIsSet(), "userSelected");
      this.userSelected = userSelected.orElse(null);
      optBits |= OPT_BIT_USER_SELECTED;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(Optional<String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(Uri system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = Objects.requireNonNull(system, "system");
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("system")
    public final Builder system(Optional<? extends Uri> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for chained invocation
     */
    public final Builder display(String display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = Objects.requireNonNull(display, "display");
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("display")
    public final Builder display(Optional<String> display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = display.orElse(null);
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Builds a new {@link Coding Coding}.
     * @return An immutable instance of Coding
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Coding build() {
      return new ImmutableCoding(userSelected, id, version, extension, system, display, code);
    }

    private boolean userSelectedIsSet() {
      return (optBits & OPT_BIT_USER_SELECTED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Coding is strict, attribute is already set: ".concat(name));
    }
  }
}
